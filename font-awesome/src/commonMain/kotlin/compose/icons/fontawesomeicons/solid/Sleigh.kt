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

public val SolidGroup.Sleigh: ImageVector
    get() {
        if (_sleigh != null) {
            return _sleigh!!
        }
        _sleigh = Builder(name = "Sleigh", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 96.0f, 32.0f, 96.0f)
                verticalLineTo(256.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(384.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(352.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                verticalLineTo(160.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(512.0f)
                horizontalLineTo(480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(41.3f)
                curveToRelative(0.0f, 30.2f, -24.5f, 54.7f, -54.7f, 54.7f)
                curveToRelative(-75.5f, 0.0f, -145.6f, -38.9f, -185.6f, -102.9f)
                lineToRelative(-4.3f, -6.9f)
                curveTo(174.2f, 67.6f, 125.0f, 37.6f, 70.7f, 32.7f)
                curveToRelative(-2.2f, -0.5f, -4.4f, -0.7f, -6.7f, -0.7f)
                horizontalLineTo(55.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(640.0f, 384.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(552.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, -39.4f, 88.0f, -88.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _sleigh!!
    }

private var _sleigh: ImageVector? = null
