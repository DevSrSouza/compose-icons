package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PrintOutline: ImageVector
    get() {
        if (_printOutline != null) {
            return _printOutline!!
        }
        _printOutline = Builder(name = "PrintOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 368.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineTo(168.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, -40.0f, -40.0f)
                horizontalLineTo(104.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, -40.0f, 40.0f)
                verticalLineTo(328.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(24.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.32f, 240.0f)
                lineTo(359.68f, 240.0f)
                arcTo(24.32f, 24.32f, 0.0f, false, true, 384.0f, 264.32f)
                lineTo(384.0f, 423.68f)
                arcTo(24.32f, 24.32f, 0.0f, false, true, 359.68f, 448.0f)
                lineTo(152.32f, 448.0f)
                arcTo(24.32f, 24.32f, 0.0f, false, true, 128.0f, 423.68f)
                lineTo(128.0f, 264.32f)
                arcTo(24.32f, 24.32f, 0.0f, false, true, 152.32f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 128.0f)
                verticalLineTo(104.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, -40.0f, -40.0f)
                horizontalLineTo(168.0f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, -40.0f, 40.0f)
                verticalLineToRelative(24.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.0f, 184.0f)
                moveToRelative(-24.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
            }
        }
        .build()
        return _printOutline!!
    }

private var _printOutline: ImageVector? = null
