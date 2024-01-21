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

public val SimpleIcons.Gsk: ImageVector
    get() {
        if (_gsk != null) {
            return _gsk!!
        }
        _gsk = Builder(name = "Gsk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.769f, 13.5f)
                verticalLineToRelative(2.114f)
                horizontalLineToRelative(1.49f)
                verticalLineTo(12.3f)
                curveToRelative(0.0f, -0.15f, 0.115f, -0.174f, 0.2f, -0.093f)
                lineToRelative(3.512f, 3.408f)
                horizontalLineTo(24.0f)
                lineTo(20.279f, 12.0f)
                lineTo(24.0f, 8.384f)
                horizontalLineToRelative(-2.034f)
                lineToRelative(-3.512f, 3.408f)
                curveToRelative(-0.081f, 0.081f, -0.2f, 0.058f, -0.2f, -0.093f)
                verticalLineTo(8.384f)
                horizontalLineToRelative(-1.485f)
                verticalLineToRelative(2.125f)
                curveToRelative(0.0f, 0.763f, 0.5f, 1.225f, 1.386f, 1.468f)
                curveToRelative(0.035f, 0.011f, 0.035f, 0.046f, 0.0f, 0.057f)
                curveToRelative(-0.89f, 0.243f, -1.386f, 0.705f, -1.386f, 1.466f)
                close()
                moveTo(8.323f, 11.191f)
                curveToRelative(0.0f, 0.924f, 0.774f, 1.5f, 1.825f, 1.5f)
                horizontalLineToRelative(3.535f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, 0.416f, 0.416f)
                verticalLineToRelative(0.6f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, -0.416f, 0.416f)
                horizontalLineTo(8.7f)
                verticalLineToRelative(1.49f)
                horizontalLineToRelative(5.014f)
                arcToRelative(1.793f, 1.793f, 0.0f, false, false, 1.837f, -1.838f)
                verticalLineToRelative(-0.657f)
                arcToRelative(1.791f, 1.791f, 0.0f, false, false, -1.836f, -1.837f)
                horizontalLineTo(10.2f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, -0.416f, -0.416f)
                verticalLineToRelative(-0.717f)
                arcToRelative(0.255f, 0.255f, 0.0f, false, true, 0.277f, -0.277f)
                horizontalLineToRelative(4.9f)
                verticalLineTo(8.384f)
                horizontalLineTo(10.76f)
                arcToRelative(1.011f, 1.011f, 0.0f, false, false, -1.016f, 1.0f)
                verticalLineTo(9.8f)
                arcToRelative(0.067f, 0.067f, 0.0f, false, true, -0.065f, 0.069f)
                horizontalLineToRelative(-0.005f)
                arcToRelative(1.269f, 1.269f, 0.0f, false, false, -1.351f, 1.322f)
                close()
                moveTo(6.666f, 11.284f)
                horizontalLineTo(4.274f)
                verticalLineToRelative(0.448f)
                arcToRelative(0.957f, 0.957f, 0.0f, false, false, 0.951f, 0.962f)
                horizontalLineToRelative(0.585f)
                verticalLineToRelative(1.155f)
                arcToRelative(0.278f, 0.278f, 0.0f, false, true, -0.278f, 0.277f)
                horizontalLineTo(1.907f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, -0.416f, -0.416f)
                verticalLineToRelative(-3.42f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.415f, -0.416f)
                horizontalLineTo(5.8f)
                verticalLineToRelative(-1.49f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.8f, 1.8f)
                verticalLineToRelative(3.635f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.8f, 1.8f)
                horizontalLineToRelative(3.017f)
                arcTo(1.018f, 1.018f, 0.0f, false, false, 5.834f, 14.6f)
                verticalLineToRelative(-0.4f)
                arcToRelative(0.067f, 0.067f, 0.0f, false, true, 0.065f, -0.07f)
                curveToRelative(0.808f, -0.023f, 1.328f, -0.416f, 1.328f, -1.1f)
                verticalLineToRelative(-1.746f)
                close()
            }
        }
        .build()
        return _gsk!!
    }

private var _gsk: ImageVector? = null
