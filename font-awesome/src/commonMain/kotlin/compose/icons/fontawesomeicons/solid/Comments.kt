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

public val SolidGroup.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 192.0f)
                curveToRelative(0.0f, -88.4f, -93.1f, -160.0f, -208.0f, -160.0f)
                reflectiveCurveTo(0.0f, 103.6f, 0.0f, 192.0f)
                curveToRelative(0.0f, 34.3f, 14.1f, 65.9f, 38.0f, 92.0f)
                curveToRelative(-13.4f, 30.2f, -35.5f, 54.2f, -35.8f, 54.5f)
                curveToRelative(-2.2f, 2.3f, -2.8f, 5.7f, -1.5f, 8.7f)
                reflectiveCurveTo(4.8f, 352.0f, 8.0f, 352.0f)
                curveToRelative(36.6f, 0.0f, 66.9f, -12.3f, 88.7f, -25.0f)
                curveToRelative(32.2f, 15.7f, 70.3f, 25.0f, 111.3f, 25.0f)
                curveToRelative(114.9f, 0.0f, 208.0f, -71.6f, 208.0f, -160.0f)
                close()
                moveTo(538.0f, 412.0f)
                curveToRelative(23.9f, -26.0f, 38.0f, -57.7f, 38.0f, -92.0f)
                curveToRelative(0.0f, -66.9f, -53.5f, -124.2f, -129.3f, -148.1f)
                curveToRelative(0.9f, 6.6f, 1.3f, 13.3f, 1.3f, 20.1f)
                curveToRelative(0.0f, 105.9f, -107.7f, 192.0f, -240.0f, 192.0f)
                curveToRelative(-10.8f, 0.0f, -21.3f, -0.8f, -31.7f, -1.9f)
                curveTo(207.8f, 439.6f, 281.8f, 480.0f, 368.0f, 480.0f)
                curveToRelative(41.0f, 0.0f, 79.1f, -9.2f, 111.3f, -25.0f)
                curveToRelative(21.8f, 12.7f, 52.1f, 25.0f, 88.7f, 25.0f)
                curveToRelative(3.2f, 0.0f, 6.1f, -1.9f, 7.3f, -4.8f)
                curveToRelative(1.3f, -2.9f, 0.7f, -6.3f, -1.5f, -8.7f)
                curveToRelative(-0.3f, -0.3f, -22.4f, -24.2f, -35.8f, -54.5f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
