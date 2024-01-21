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

public val SimpleIcons.Hasura: ImageVector
    get() {
        if (_hasura != null) {
            return _hasura!!
        }
        _hasura = Builder(name = "Hasura", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.558f, 8.172f)
                curveToRelative(0.707f, -2.152f, 0.282f, -6.447f, -1.09f, -8.032f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, false, -0.664f, 0.051f)
                lineToRelative(-1.69f, 2.59f)
                arcToRelative(1.322f, 1.322f, 0.0f, false, true, -1.737f, 0.276f)
                curveTo(16.544f, 1.885f, 14.354f, 1.204f, 12.0f, 1.204f)
                reflectiveCurveToRelative(-4.544f, 0.68f, -6.378f, 1.853f)
                arcToRelative(1.326f, 1.326f, 0.0f, false, true, -1.736f, -0.276f)
                lineTo(2.196f, 0.191f)
                arcTo(0.42f, 0.42f, 0.0f, false, false, 1.532f, 0.14f)
                curveTo(0.16f, 1.728f, -0.265f, 6.023f, 0.442f, 8.172f)
                curveToRelative(0.236f, 0.716f, 0.3f, 1.472f, 0.16f, 2.207f)
                curveToRelative(-0.137f, 0.73f, -0.276f, 1.61f, -0.276f, 2.223f)
                curveTo(0.326f, 18.898f, 5.553f, 24.0f, 11.997f, 24.0f)
                curveToRelative(6.447f, 0.0f, 11.671f, -5.105f, 11.671f, -11.398f)
                curveToRelative(0.0f, -0.613f, -0.138f, -1.494f, -0.276f, -2.223f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, true, 0.166f, -2.207f)
                close()
                moveTo(11.998f, 21.456f)
                curveToRelative(-4.984f, 0.0f, -9.036f, -3.96f, -9.036f, -8.827f)
                curveToRelative(0.0f, -0.16f, 0.005f, -0.316f, 0.014f, -0.473f)
                curveToRelative(0.18f, -3.316f, 2.243f, -6.15f, 5.16f, -7.5f)
                curveToRelative(1.17f, -0.546f, 2.481f, -0.848f, 3.864f, -0.848f)
                reflectiveCurveToRelative(2.69f, 0.302f, 3.864f, 0.85f)
                curveToRelative(2.917f, 1.351f, 4.98f, 4.187f, 5.16f, 7.501f)
                curveToRelative(0.008f, 0.157f, 0.014f, 0.316f, 0.014f, 0.473f)
                curveToRelative(-0.003f, 4.864f, -4.057f, 8.824f, -9.04f, 8.824f)
                close()
                moveTo(15.913f, 16.026f)
                lineTo(13.603f, 12.116f)
                lineTo(11.623f, 8.856f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, false, -0.223f, -0.125f)
                lineTo(9.508f, 8.731f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, false, -0.227f, 0.13f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, 0.003f, 0.254f)
                lineToRelative(1.895f, 3.109f)
                lineToRelative(-2.542f, 3.787f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.011f, 0.259f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, false, 0.23f, 0.132f)
                horizontalLineToRelative(1.905f)
                arcToRelative(0.259f, 0.259f, 0.0f, false, false, 0.218f, -0.116f)
                lineToRelative(1.375f, -2.096f)
                lineToRelative(1.233f, 2.088f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, false, 0.224f, 0.127f)
                horizontalLineToRelative(1.878f)
                curveToRelative(0.094f, 0.0f, 0.18f, -0.049f, 0.224f, -0.127f)
                arcToRelative(0.241f, 0.241f, 0.0f, false, false, 0.0f, -0.251f)
                close()
            }
        }
        .build()
        return _hasura!!
    }

private var _hasura: ImageVector? = null
