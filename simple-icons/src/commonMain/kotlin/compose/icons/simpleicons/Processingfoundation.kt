package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Processingfoundation: ImageVector
    get() {
        if (_processingfoundation != null) {
            return _processingfoundation!!
        }
        _processingfoundation = Builder(name = "Processingfoundation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(13.182f, 5.255f)
                horizontalLineToRelative(0.048f)
                curveToRelative(3.273f, 0.0f, 5.247f, 1.48f, 5.247f, 4.103f)
                curveToRelative(0.0f, 2.727f, -1.974f, 4.536f, -5.295f, 4.669f)
                verticalLineToRelative(-1.742f)
                curveToRelative(1.837f, -0.11f, 2.801f, -1.061f, 2.801f, -2.744f)
                curveToRelative(0.0f, -1.498f, -0.957f, -2.442f, -2.8f, -2.516f)
                close()
                moveTo(11.409f, 5.281f)
                lineToRelative(0.005f, 11.896f)
                curveToRelative(0.779f, 0.052f, 1.583f, 0.18f, 2.26f, 0.337f)
                lineToRelative(-0.269f, 1.324f)
                lineTo(6.788f, 18.838f)
                verticalLineToRelative(-1.324f)
                arcToRelative(14.96f, 14.96f, 0.0f, false, true, 2.26f, -0.337f)
                lineTo(9.048f, 6.993f)
                arcToRelative(14.71f, 14.71f, 0.0f, false, true, -2.26f, -0.337f)
                lineTo(6.788f, 5.33f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.64f, 0.0f, 1.469f, -0.028f, 2.361f, -0.05f)
                close()
            }
        }
        .build()
        return _processingfoundation!!
    }

private var _processingfoundation: ImageVector? = null
