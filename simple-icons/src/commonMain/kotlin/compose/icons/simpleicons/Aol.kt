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

public val SimpleIcons.Aol: ImageVector
    get() {
        if (_aol != null) {
            return _aol!!
        }
        _aol = Builder(name = "Aol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.07f, 9.334f)
                curveToRelative(2.526f, 0.0f, 3.74f, 1.997f, 3.74f, 3.706f)
                curveToRelative(0.0f, 1.709f, -1.214f, 3.706f, -3.74f, 3.706f)
                curveToRelative(-2.527f, 0.0f, -3.74f, -1.997f, -3.74f, -3.706f)
                curveToRelative(0.0f, -1.709f, 1.213f, -3.706f, 3.74f, -3.706f)
                moveToRelative(0.0f, 5.465f)
                curveToRelative(0.9f, 0.0f, 1.663f, -0.741f, 1.663f, -1.759f)
                curveToRelative(0.0f, -1.018f, -0.763f, -1.759f, -1.663f, -1.759f)
                reflectiveCurveToRelative(-1.664f, 0.741f, -1.664f, 1.759f)
                curveToRelative(0.0f, 1.018f, 0.764f, 1.76f, 1.664f, 1.76f)
                moveToRelative(4.913f, -7.546f)
                horizontalLineToRelative(2.104f)
                verticalLineToRelative(9.298f)
                horizontalLineToRelative(-2.104f)
                close()
                moveTo(22.601f, 13.821f)
                arcToRelative(1.398f, 1.398f, 0.0f, true, false, 0.002f, 2.796f)
                arcToRelative(1.398f, 1.398f, 0.0f, false, false, -0.002f, -2.796f)
                moveTo(5.536f, 7.254f)
                lineTo(3.662f, 7.254f)
                lineTo(0.0f, 16.55f)
                horizontalLineToRelative(2.482f)
                lineToRelative(0.49f, -1.343f)
                horizontalLineToRelative(3.23f)
                lineToRelative(0.452f, 1.343f)
                lineTo(9.16f, 16.55f)
                close()
                moveTo(3.626f, 13.322f)
                lineTo(4.6f, 10.08f)
                lineToRelative(0.974f, 3.242f)
                lineTo(3.626f, 13.322f)
                close()
            }
        }
        .build()
        return _aol!!
    }

private var _aol: ImageVector? = null
