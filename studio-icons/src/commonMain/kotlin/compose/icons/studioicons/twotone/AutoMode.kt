package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.AutoMode: ImageVector
    get() {
        if (_autoMode != null) {
            return _autoMode!!
        }
        _autoMode = Builder(name = "AutoMode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.03f, 3.56f)
                curveToRelative(-1.67f, -1.39f, -3.74f, -2.3f, -6.03f, -2.51f)
                verticalLineToRelative(2.01f)
                curveToRelative(1.73f, 0.19f, 3.31f, 0.88f, 4.61f, 1.92f)
                lineTo(19.03f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.06f)
                verticalLineTo(1.05f)
                curveTo(8.71f, 1.25f, 6.64f, 2.17f, 4.97f, 3.56f)
                lineToRelative(1.42f, 1.42f)
                curveTo(7.69f, 3.94f, 9.27f, 3.25f, 11.0f, 3.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.98f, 6.39f)
                lineTo(3.56f, 4.97f)
                curveTo(2.17f, 6.64f, 1.26f, 8.71f, 1.05f, 11.0f)
                horizontalLineToRelative(2.01f)
                curveTo(3.25f, 9.27f, 3.94f, 7.69f, 4.98f, 6.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 11.0f)
                horizontalLineToRelative(2.01f)
                curveToRelative(-0.21f, -2.29f, -1.12f, -4.36f, -2.51f, -6.03f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(20.06f, 7.69f, 20.75f, 9.27f, 20.94f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                lineToRelative(3.44f, 1.56f)
                lineToRelative(1.56f, 3.44f)
                lineToRelative(1.56f, -3.44f)
                lineToRelative(3.44f, -1.56f)
                lineToRelative(-3.44f, -1.56f)
                lineToRelative(-1.56f, -3.44f)
                lineToRelative(-1.56f, 3.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.11f, 0.0f, -5.85f, -1.59f, -7.46f, -4.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.7f)
                curveToRelative(1.99f, 2.84f, 5.27f, 4.7f, 9.0f, 4.7f)
                curveToRelative(4.87f, 0.0f, 9.0f, -3.17f, 10.44f, -7.56f)
                lineToRelative(-1.96f, -0.45f)
                curveTo(19.25f, 18.48f, 15.92f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _autoMode!!
    }

private var _autoMode: ImageVector? = null
