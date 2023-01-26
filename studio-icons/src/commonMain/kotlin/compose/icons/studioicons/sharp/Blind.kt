package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Blind: ImageVector
    get() {
        if (_blind != null) {
            return _blind!!
        }
        _blind = Builder(name = "Blind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.5f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.13f, 7.12f)
                curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f)
                curveTo(10.72f, 5.91f, 9.99f, 5.93f, 9.4f, 6.24f)
                lineToRelative(0.0f, -0.01f)
                lineTo(4.0f, 9.3f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.54f)
                lineToRelative(1.5f, -0.85f)
                curveTo(7.18f, 10.71f, 7.0f, 11.85f, 7.0f, 13.0f)
                verticalLineToRelative(5.33f)
                lineTo(4.4f, 21.8f)
                lineTo(6.0f, 23.0f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(0.22f, -3.54f)
                lineTo(11.0f, 18.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                lineToRelative(-1.97f, -2.81f)
                curveToRelative(-0.04f, -0.52f, -0.14f, -1.76f, 0.45f, -3.4f)
                curveToRelative(0.75f, 1.14f, 1.88f, 1.98f, 3.2f, 2.41f)
                lineTo(20.63f, 23.0f)
                lineToRelative(0.87f, -0.5f)
                lineTo(16.02f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.49f, 0.0f, -2.88f, 0.17f, -4.08f, -2.21f)
            }
        }
        .build()
        return _blind!!
    }

private var _blind: ImageVector? = null
