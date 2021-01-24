package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Monument: ImageVector
    get() {
        if (_monument != null) {
            return _monument!!
        }
        _monument = Builder(name = "Monument", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 448.0f)
                lineTo(16.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(289.14f, 100.74f)
                arcToRelative(31.97f, 31.97f, 0.0f, false, false, -9.21f, -19.44f)
                lineTo(203.31f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineToRelative(-76.6f, 76.61f)
                arcToRelative(31.97f, 31.97f, 0.0f, false, false, -9.21f, 19.44f)
                lineTo(64.0f, 416.0f)
                horizontalLineToRelative(256.0f)
                lineToRelative(-30.86f, -315.26f)
                close()
                moveTo(240.0f, 307.2f)
                curveToRelative(0.0f, 6.4f, -6.4f, 12.8f, -12.8f, 12.8f)
                horizontalLineToRelative(-70.4f)
                curveToRelative(-6.4f, 0.0f, -12.8f, -6.4f, -12.8f, -12.8f)
                verticalLineToRelative(-38.4f)
                curveToRelative(0.0f, -6.4f, 6.4f, -12.8f, 12.8f, -12.8f)
                horizontalLineToRelative(70.4f)
                curveToRelative(6.4f, 0.0f, 12.8f, 6.4f, 12.8f, 12.8f)
                verticalLineToRelative(38.4f)
                close()
            }
        }
        .build()
        return _monument!!
    }

private var _monument: ImageVector? = null
