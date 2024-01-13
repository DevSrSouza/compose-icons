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

public val SimpleIcons.Affinitydesigner: ImageVector
    get() {
        if (_affinitydesigner != null) {
            return _affinitydesigner!!
        }
        _affinitydesigner = Builder(name = "Affinitydesigner", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.344f)
                verticalLineToRelative(19.312f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 21.656f, 24.0f)
                lineTo(2.344f, 24.0f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 0.0f, 21.656f)
                lineTo(0.0f, 2.344f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 2.344f, 0.0f)
                horizontalLineToRelative(19.312f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 24.0f, 2.344f)
                close()
                moveTo(1.758f, 21.305f)
                curveToRelative(0.0f, 0.517f, 0.42f, 0.937f, 0.938f, 0.937f)
                horizontalLineToRelative(8.226f)
                lineToRelative(-4.299f, -7.445f)
                lineToRelative(7.528f, -13.039f)
                horizontalLineToRelative(-3.482f)
                lineTo(1.758f, 17.192f)
                verticalLineToRelative(4.113f)
                close()
                moveTo(13.176f, 14.439f)
                lineTo(10.464f, 9.741f)
                lineTo(8.703f, 12.792f)
                arcToRelative(1.098f, 1.098f, 0.0f, false, false, 0.952f, 1.647f)
                horizontalLineToRelative(3.521f)
                close()
                moveTo(22.242f, 21.312f)
                verticalLineToRelative(-6.075f)
                lineTo(7.799f, 15.237f)
                lineToRelative(4.044f, 7.005f)
                horizontalLineToRelative(9.462f)
                arcToRelative(0.937f, 0.937f, 0.0f, false, false, 0.937f, -0.93f)
                close()
                moveTo(21.305f, 1.758f)
                horizontalLineToRelative(-6.232f)
                lineToRelative(-4.148f, 7.185f)
                lineToRelative(3.173f, 5.496f)
                horizontalLineToRelative(8.144f)
                lineTo(22.242f, 2.688f)
                arcToRelative(0.937f, 0.937f, 0.0f, false, false, -0.937f, -0.93f)
                close()
            }
        }
        .build()
        return _affinitydesigner!!
    }

private var _affinitydesigner: ImageVector? = null
