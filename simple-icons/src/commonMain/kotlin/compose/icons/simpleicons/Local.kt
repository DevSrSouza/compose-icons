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

public val SimpleIcons.Local: ImageVector
    get() {
        if (_local != null) {
            return _local!!
        }
        _local = Builder(name = "Local", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.49f, 11.97f)
                lineToRelative(6.682f, -6.681f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, false, 0.204f, -0.476f)
                lineTo(11.376f, 0.838f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.42f, -0.624f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.736f, 0.148f)
                lineTo(1.4f, 9.193f)
                curveToRelative(-0.94f, 0.94f, -1.388f, 1.85f, -1.4f, 2.805f)
                reflectiveCurveToRelative(0.434f, 1.85f, 1.36f, 2.774f)
                lineToRelative(8.858f, 8.86f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, false, 0.476f, 0.203f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, 0.26f, -0.082f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.42f, -0.626f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, false, -0.204f, -0.476f)
                lineTo(4.489f, 11.97f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(1.85f, 13.29f)
                curveToRelative(-0.34f, -0.45f, -0.502f, -0.872f, -0.502f, -1.28f)
                curveToRelative(0.012f, -0.57f, 0.34f, -1.182f, 1.007f, -1.85f)
                lineToRelative(7.66f, -7.662f)
                verticalLineToRelative(2.057f)
                lineToRelative(-7.06f, 7.06f)
                arcTo(4.355f, 4.355f, 0.0f, false, false, 1.85f, 13.29f)
                close()
                moveTo(10.016f, 21.495f)
                lineTo(3.565f, 15.045f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, false, -0.094f, -0.12f)
                curveToRelative(-0.204f, -0.207f, -0.816f, -0.819f, 0.094f, -1.961f)
                lineToRelative(6.45f, 6.449f)
                verticalLineToRelative(2.082f)
                close()
                moveTo(13.782f, 0.376f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, false, -0.734f, -0.15f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.422f, 0.626f)
                verticalLineToRelative(4.015f)
                curveToRelative(0.004f, 0.18f, 0.076f, 0.35f, 0.204f, 0.476f)
                lineToRelative(6.681f, 6.68f)
                lineToRelative(-6.681f, 6.682f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, false, -0.204f, 0.476f)
                verticalLineToRelative(3.96f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, 1.156f, 0.49f)
                lineToRelative(8.817f, -8.817f)
                curveToRelative(0.94f, -0.94f, 1.389f, -1.85f, 1.4f, -2.804f)
                curveToRelative(0.017f, -0.952f, -0.433f, -1.85f, -1.36f, -2.775f)
                lineTo(13.782f, 0.376f)
                close()
                moveTo(13.986f, 4.581f)
                lineTo(13.986f, 2.5f)
                lineToRelative(6.451f, 6.448f)
                curveToRelative(0.026f, 0.044f, 0.06f, 0.084f, 0.094f, 0.122f)
                curveToRelative(0.204f, 0.204f, 0.816f, 0.817f, -0.094f, 1.96f)
                lineToRelative(-6.449f, -6.45f)
                lineToRelative(-0.002f, 0.002f)
                close()
                moveTo(21.633f, 13.848f)
                lineTo(13.973f, 21.509f)
                verticalLineToRelative(-2.04f)
                lineToRelative(7.06f, -7.077f)
                arcToRelative(4.451f, 4.451f, 0.0f, false, false, 1.104f, -1.674f)
                curveToRelative(0.34f, 0.45f, 0.504f, 0.872f, 0.504f, 1.28f)
                curveToRelative(-0.014f, 0.57f, -0.34f, 1.17f, -1.008f, 1.85f)
                close()
                moveTo(17.007f, 12.554f)
                lineTo(6.9f, 12.554f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.516f, -0.516f)
                verticalLineToRelative(-0.054f)
                curveToRelative(0.0f, -0.286f, 0.23f, -0.518f, 0.516f, -0.518f)
                horizontalLineToRelative(10.11f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.518f, 0.518f)
                verticalLineToRelative(0.054f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, -0.518f, 0.516f)
                horizontalLineToRelative(-0.004f)
                close()
                moveTo(15.567f, 10.01f)
                verticalLineToRelative(0.056f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.52f, 0.516f)
                lineTo(8.842f, 10.582f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.518f, -0.516f)
                verticalLineToRelative(-0.056f)
                curveToRelative(0.0f, -0.285f, 0.232f, -0.517f, 0.518f, -0.517f)
                horizontalLineToRelative(6.205f)
                curveToRelative(0.286f, 0.0f, 0.516f, 0.232f, 0.516f, 0.517f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(13.647f, 8.023f)
                verticalLineToRelative(0.054f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.517f, 0.518f)
                horizontalLineToRelative(-2.464f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.516f, -0.518f)
                verticalLineToRelative(-0.054f)
                curveToRelative(0.0f, -0.286f, 0.232f, -0.516f, 0.516f, -0.516f)
                horizontalLineToRelative(2.464f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, 0.516f, 0.516f)
                close()
                moveTo(13.13f, 15.466f)
                curveToRelative(0.284f, 0.0f, 0.516f, 0.232f, 0.516f, 0.518f)
                verticalLineToRelative(0.054f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.516f, 0.516f)
                horizontalLineToRelative(-2.464f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.516f, -0.516f)
                verticalLineToRelative(-0.054f)
                curveToRelative(0.0f, -0.286f, 0.232f, -0.518f, 0.516f, -0.518f)
                horizontalLineToRelative(2.464f)
                close()
                moveTo(15.048f, 14.554f)
                lineTo(8.843f, 14.554f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.518f, -0.516f)
                verticalLineToRelative(-0.054f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.518f, -0.518f)
                horizontalLineToRelative(6.205f)
                curveToRelative(0.286f, 0.0f, 0.516f, 0.232f, 0.516f, 0.518f)
                verticalLineToRelative(0.054f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.516f, 0.516f)
                close()
            }
        }
        .build()
        return _local!!
    }

private var _local: ImageVector? = null
