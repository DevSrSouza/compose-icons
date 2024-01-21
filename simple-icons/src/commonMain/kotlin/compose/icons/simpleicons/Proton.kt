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

public val SimpleIcons.Proton: ImageVector
    get() {
        if (_proton != null) {
            return _proton!!
        }
        _proton = Builder(name = "Proton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.474f, 17.75f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(4.401f)
                verticalLineToRelative(-5.979f)
                curveToRelative(0.0f, -0.582f, 0.232f, -1.14f, 0.645f, -1.551f)
                arcToRelative(2.204f, 2.204f, 0.0f, false, true, 1.556f, -0.643f)
                horizontalLineToRelative(4.513f)
                arcToRelative(7.955f, 7.955f, 0.0f, false, false, 5.612f, -2.318f)
                arcToRelative(7.907f, 7.907f, 0.0f, false, false, 2.325f, -5.595f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, -2.325f, -5.596f)
                arcTo(7.958f, 7.958f, 0.0f, false, false, 13.587f, 0.0f)
                horizontalLineTo(2.474f)
                verticalLineToRelative(7.812f)
                horizontalLineToRelative(4.401f)
                verticalLineTo(4.129f)
                horizontalLineToRelative(6.416f)
                curveToRelative(0.995f, 0.0f, 1.951f, 0.394f, 2.656f, 1.097f)
                curveToRelative(0.704f, 0.7f, 1.1f, 1.653f, 1.101f, 2.646f)
                arcToRelative(3.742f, 3.742f, 0.0f, false, true, -1.101f, 2.648f)
                arcToRelative(3.766f, 3.766f, 0.0f, false, true, -2.656f, 1.097f)
                horizontalLineTo(8.627f)
                arcToRelative(6.158f, 6.158f, 0.0f, false, false, -4.352f, 1.795f)
                arcToRelative(6.133f, 6.133f, 0.0f, false, false, -1.801f, 4.338f)
                close()
            }
        }
        .build()
        return _proton!!
    }

private var _proton: ImageVector? = null
