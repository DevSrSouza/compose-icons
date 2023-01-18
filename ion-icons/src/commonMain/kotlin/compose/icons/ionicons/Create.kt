package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Create: ImageVector
    get() {
        if (_create != null) {
            return _create!!
        }
        _create = Builder(name = "Create", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.34f, 193.66f)
                lineTo(264.45f, 315.79f)
                arcTo(41.08f, 41.08f, 0.0f, false, true, 247.58f, 326.0f)
                lineToRelative(-25.9f, 8.67f)
                arcToRelative(35.92f, 35.92f, 0.0f, false, true, -44.33f, -44.33f)
                lineToRelative(8.67f, -25.9f)
                arcToRelative(41.08f, 41.08f, 0.0f, false, true, 10.19f, -16.87f)
                lineTo(318.34f, 125.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 312.69f, 112.0f)
                horizontalLineTo(104.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineTo(408.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineTo(344.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, -56.0f)
                verticalLineTo(199.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 386.34f, 193.66f)
                close()
            }
        }
        .build()
        return _create!!
    }

private var _create: ImageVector? = null
