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

public val TwotoneGroup.AddModerator: ImageVector
    get() {
        if (_addModerator != null) {
            return _addModerator!!
        }
        _addModerator = Builder(name = "AddModerator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.14f)
                lineTo(6.0f, 6.39f)
                verticalLineToRelative(4.7f)
                curveToRelative(0.0f, 3.33f, 1.76f, 6.44f, 4.33f, 8.04f)
                curveToRelative(-1.56f, -4.89f, 2.5f, -9.8f, 7.67f, -9.05f)
                verticalLineTo(6.39f)
                lineTo(12.0f, 4.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.33f, 19.13f)
                curveTo(7.76f, 17.53f, 6.0f, 14.42f, 6.0f, 11.09f)
                verticalLineToRelative(-4.7f)
                lineToRelative(6.0f, -2.25f)
                lineToRelative(6.0f, 2.25f)
                verticalLineToRelative(3.69f)
                curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f)
                verticalLineTo(5.0f)
                lineToRelative(-8.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(6.09f)
                curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f)
                curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.08f, -0.02f)
                curveTo(11.29f, 21.19f, 10.68f, 20.22f, 10.33f, 19.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(20.0f, 17.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _addModerator!!
    }

private var _addModerator: ImageVector? = null
