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

public val SimpleIcons.Swr: ImageVector
    get() {
        if (_swr != null) {
            return _swr!!
        }
        _swr = Builder(name = "Swr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.187f)
                arcToRelative(2.659f, 2.659f, 0.0f, false, false, 2.648f, 2.647f)
                arcToRelative(2.662f, 2.662f, 0.0f, false, false, 2.647f, -2.646f)
                verticalLineToRelative(-0.376f)
                arcToRelative(1.097f, 1.097f, 0.0f, false, true, 1.092f, -1.086f)
                curveToRelative(0.326f, 0.0f, 0.636f, 0.147f, 0.844f, 0.399f)
                horizontalLineToRelative(1.712f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, false, -2.558f, -1.959f)
                arcToRelative(2.664f, 2.664f, 0.0f, false, false, -2.647f, 2.647f)
                verticalLineToRelative(0.374f)
                curveToRelative(0.0f, 0.598f, -0.493f, 1.09f, -1.091f, 1.09f)
                arcToRelative(1.096f, 1.096f, 0.0f, false, true, -1.09f, -1.09f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, false, -0.312f, -0.312f)
                lineTo(0.311f, 11.875f)
                arcToRelative(0.313f, 0.313f, 0.0f, false, false, -0.311f, 0.312f)
                close()
                moveTo(10.131f, 14.834f)
                arcToRelative(2.664f, 2.664f, 0.0f, false, true, -2.555f, -1.96f)
                horizontalLineToRelative(1.71f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, 1.935f, -0.683f)
                verticalLineToRelative(-0.379f)
                arcToRelative(2.663f, 2.663f, 0.0f, false, true, 2.648f, -2.646f)
                arcToRelative(2.65f, 2.65f, 0.0f, false, true, 2.647f, 2.591f)
                lineToRelative(0.008f, 0.43f)
                arcToRelative(1.097f, 1.097f, 0.0f, false, false, 1.092f, 1.086f)
                curveToRelative(0.326f, 0.0f, 0.636f, -0.146f, 0.843f, -0.399f)
                horizontalLineToRelative(1.712f)
                arcToRelative(2.657f, 2.657f, 0.0f, false, true, -2.556f, 1.96f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, true, -2.648f, -2.646f)
                lineToRelative(-0.008f, -0.389f)
                verticalLineToRelative(-0.017f)
                arcToRelative(1.096f, 1.096f, 0.0f, false, false, -1.09f, -1.059f)
                arcToRelative(1.096f, 1.096f, 0.0f, false, false, -1.09f, 1.09f)
                verticalLineToRelative(0.374f)
                arcToRelative(2.663f, 2.663f, 0.0f, false, true, -2.648f, 2.647f)
                close()
                moveTo(20.507f, 11.126f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, 1.936f, 0.683f)
                verticalLineToRelative(0.004f)
                curveToRelative(0.0f, 0.171f, 0.14f, 0.312f, 0.311f, 0.312f)
                horizontalLineToRelative(0.935f)
                arcToRelative(0.313f, 0.313f, 0.0f, false, false, 0.311f, -0.312f)
                arcToRelative(2.663f, 2.663f, 0.0f, false, false, -2.648f, -2.647f)
                arcToRelative(2.659f, 2.659f, 0.0f, false, false, -2.557f, 1.96f)
                horizontalLineToRelative(1.712f)
                close()
            }
        }
        .build()
        return _swr!!
    }

private var _swr: ImageVector? = null
