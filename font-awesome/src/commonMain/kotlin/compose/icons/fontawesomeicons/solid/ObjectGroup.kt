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

public val SolidGroup.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 128.0f)
                lineTo(480.0f, 96.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                lineTo(512.0f, 44.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                lineTo(64.0f, 64.0f)
                lineTo(64.0f, 44.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                lineTo(12.0f, 32.0f)
                curveTo(5.37f, 32.0f, 0.0f, 37.37f, 0.0f, 44.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(320.0f)
                lineTo(12.0f, 416.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(384.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-20.0f)
                lineTo(480.0f, 128.0f)
                close()
                moveTo(96.0f, 276.0f)
                lineTo(96.0f, 140.0f)
                curveToRelative(0.0f, -6.63f, 5.37f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(168.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(136.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                lineTo(108.0f, 288.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                close()
                moveTo(416.0f, 372.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                lineTo(236.0f, 384.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineToRelative(-52.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineToRelative(-72.0f)
                horizontalLineToRelative(84.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(136.0f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null
