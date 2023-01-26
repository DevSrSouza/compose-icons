package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Abc: ImageVector
    get() {
        if (_abc != null) {
            return _abc!!
        }
        _abc = Builder(name = "Abc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 15.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.75f)
                curveTo(4.5f, 14.66f, 4.16f, 15.0f, 3.75f, 15.0f)
                reflectiveCurveTo(3.0f, 14.66f, 3.0f, 14.25f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.25f)
                curveTo(8.0f, 14.66f, 7.66f, 15.0f, 7.25f, 15.0f)
                close()
                moveTo(6.5f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveTo(14.5f, 11.55f, 14.05f, 12.0f, 13.5f, 12.0f)
                close()
                moveTo(11.0f, 10.5f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 12.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(21.0f, 10.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.33f, 0.0f, -0.6f, -0.21f, -0.71f, -0.5f)
                lineToRelative(-2.04f, 0.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.04f, 0.0f)
                curveToRelative(0.1f, -0.29f, 0.38f, -0.5f, 0.71f, -0.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(14.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _abc!!
    }

private var _abc: ImageVector? = null
