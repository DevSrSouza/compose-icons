package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.027f, 26.329f)
                lineToRelative(-168.0f, 28.0f)
                curveTo(254.693f, 56.218f, 256.0f, 67.8f, 256.0f, 72.0f)
                horizontalLineToRelative(-58.332f)
                curveTo(208.353f, 36.108f, 181.446f, 0.0f, 144.0f, 0.0f)
                curveToRelative(-39.435f, 0.0f, -66.368f, 39.676f, -52.228f, 76.203f)
                curveToRelative(-52.039f, 13.051f, -75.381f, 54.213f, -90.049f, 90.884f)
                curveToRelative(-4.923f, 12.307f, 1.063f, 26.274f, 13.37f, 31.197f)
                curveToRelative(12.317f, 4.926f, 26.279f, -1.075f, 31.196f, -13.37f)
                curveTo(75.058f, 112.99f, 106.964f, 120.0f, 168.0f, 120.0f)
                verticalLineToRelative(27.076f)
                curveToRelative(-41.543f, 10.862f, -72.0f, 49.235f, -72.0f, 94.129f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(144.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(240.0f)
                curveToRelative(0.0f, -44.731f, -30.596f, -82.312f, -72.0f, -92.97f)
                verticalLineTo(120.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(0.0f, 2.974f, -1.703f, 15.716f, 10.027f, 17.671f)
                lineToRelative(168.0f, 28.0f)
                curveTo(441.342f, 166.89f, 448.0f, 161.25f, 448.0f, 153.834f)
                verticalLineTo(38.166f)
                curveToRelative(0.0f, -7.416f, -6.658f, -13.056f, -13.973f, -11.837f)
                close()
                moveTo(144.0f, 72.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.178f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.178f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.178f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.178f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
