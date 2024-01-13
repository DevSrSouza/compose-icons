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

public val SimpleIcons.Semrush: ImageVector
    get() {
        if (_semrush != null) {
            return _semrush!!
        }
        _semrush = Builder(name = "Semrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.698f, 11.911f)
                curveToRelative(0.0f, 0.444f, -0.226f, 0.516f, -0.79f, 0.516f)
                curveToRelative(-0.596f, 0.0f, -0.706f, -0.1f, -0.77f, -0.554f)
                curveToRelative(-0.118f, -1.152f, -0.896f, -2.13f, -2.201f, -2.24f)
                curveToRelative(-0.418f, -0.034f, -0.518f, -0.19f, -0.518f, -0.706f)
                curveToRelative(0.0f, -0.48f, 0.074f, -0.708f, 0.446f, -0.708f)
                curveToRelative(2.265f, 0.01f, 3.833f, 1.832f, 3.833f, 3.69f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(23.998f, 11.911f)
                curveToRelative(0.0f, -3.456f, -2.338f, -7.11f, -7.74f, -7.11f)
                lineTo(5.52f, 4.801f)
                curveToRelative(-0.218f, 0.0f, -0.354f, 0.11f, -0.354f, 0.31f)
                curveToRelative(0.0f, 0.109f, 0.082f, 0.209f, 0.156f, 0.26f)
                curveToRelative(0.388f, 0.31f, 0.97f, 0.654f, 1.73f, 1.036f)
                curveToRelative(0.743f, 0.372f, 1.323f, 0.616f, 1.903f, 0.852f)
                curveToRelative(0.246f, 0.1f, 0.336f, 0.208f, 0.336f, 0.344f)
                curveToRelative(0.0f, 0.19f, -0.136f, 0.308f, -0.4f, 0.308f)
                lineTo(0.372f, 7.911f)
                curveToRelative(-0.254f, 0.0f, -0.372f, 0.164f, -0.372f, 0.326f)
                curveToRelative(0.0f, 0.136f, 0.044f, 0.254f, 0.162f, 0.372f)
                curveToRelative(0.69f, 0.726f, 1.796f, 1.596f, 3.4f, 2.604f)
                curveToRelative(1.466f, 0.91f, 2.98f, 1.74f, 4.533f, 2.492f)
                curveToRelative(0.236f, 0.11f, 0.308f, 0.236f, 0.308f, 0.372f)
                curveToRelative(-0.008f, 0.154f, -0.126f, 0.28f, -0.4f, 0.28f)
                lineTo(4.1f, 14.357f)
                curveToRelative(-0.216f, 0.0f, -0.344f, 0.12f, -0.344f, 0.3f)
                curveToRelative(0.0f, 0.1f, 0.08f, 0.226f, 0.19f, 0.326f)
                curveToRelative(0.888f, 0.808f, 2.311f, 1.688f, 4.207f, 2.494f)
                curveToRelative(2.53f, 1.08f, 5.094f, 1.721f, 7.98f, 1.721f)
                curveToRelative(5.465f, 0.0f, 7.867f, -4.087f, 7.867f, -7.289f)
                lineToRelative(-0.002f, 0.002f)
                close()
                moveTo(16.865f, 17.015f)
                curveToRelative(-2.794f, 0.0f, -5.132f, -2.276f, -5.132f, -5.114f)
                curveToRelative(0.0f, -2.794f, 2.33f, -5.04f, 5.132f, -5.04f)
                curveToRelative(2.863f, 0.0f, 5.111f, 2.24f, 5.111f, 5.04f)
                arcToRelative(5.086f, 5.086f, 0.0f, false, true, -5.111f, 5.114f)
                close()
            }
        }
        .build()
        return _semrush!!
    }

private var _semrush: ImageVector? = null
