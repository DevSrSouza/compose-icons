package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CreateOutline: ImageVector
    get() {
        if (_createOutline != null) {
            return _createOutline!!
        }
        _createOutline = Builder(name = "CreateOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 224.0f)
                verticalLineTo(408.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(104.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                verticalLineTo(168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineTo(271.48f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(459.94f, 53.25f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, -23.22f, -0.56f)
                lineTo(424.35f, 65.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f)
                lineToRelative(11.34f, 11.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.34f, 0.0f)
                lineToRelative(12.06f, -12.0f)
                curveTo(465.19f, 69.54f, 465.76f, 59.62f, 459.94f, 53.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.34f, 90.0f)
                lineTo(218.82f, 270.2f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.31f, 3.93f)
                lineTo(208.16f, 299.0f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 4.86f, 4.86f)
                lineToRelative(24.85f, -8.35f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 3.93f, -2.31f)
                lineTo(422.0f, 112.66f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 422.0f, 100.0f)
                lineTo(412.05f, 90.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 399.34f, 90.0f)
                close()
            }
        }
        .build()
        return _createOutline!!
    }

private var _createOutline: ImageVector? = null
