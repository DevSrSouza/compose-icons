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

public val SolidGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(64.0f, 14.3f, 49.7f, 0.0f, 32.0f, 0.0f)
                reflectiveCurveTo(0.0f, 14.3f, 0.0f, 32.0f)
                verticalLineTo(64.0f)
                verticalLineTo(368.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(352.0f)
                lineToRelative(64.3f, -16.1f)
                curveToRelative(41.1f, -10.3f, 84.6f, -5.5f, 122.5f, 13.4f)
                curveToRelative(44.2f, 22.1f, 95.5f, 24.8f, 141.7f, 7.4f)
                lineToRelative(34.7f, -13.0f)
                curveToRelative(12.5f, -4.7f, 20.8f, -16.6f, 20.8f, -30.0f)
                verticalLineTo(66.1f)
                curveToRelative(0.0f, -23.0f, -24.2f, -38.0f, -44.8f, -27.7f)
                lineToRelative(-9.6f, 4.8f)
                curveToRelative(-46.3f, 23.2f, -100.8f, 23.2f, -147.1f, 0.0f)
                curveToRelative(-35.1f, -17.6f, -75.4f, -22.0f, -113.5f, -12.5f)
                lineTo(64.0f, 48.0f)
                verticalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
