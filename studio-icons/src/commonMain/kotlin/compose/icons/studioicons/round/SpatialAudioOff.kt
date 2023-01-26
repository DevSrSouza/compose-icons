package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SpatialAudioOff: ImageVector
    get() {
        if (_spatialAudioOff != null) {
            return _spatialAudioOff!!
        }
        _spatialAudioOff = Builder(name = "SpatialAudioOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.39f, 15.56f)
                curveTo(14.71f, 14.7f, 12.53f, 14.0f, 10.0f, 14.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(2.61f, 16.07f, 2.0f, 17.1f, 2.0f, 18.22f)
                lineTo(2.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineToRelative(0.0f, -0.78f)
                curveTo(18.0f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.11f, 1.85f)
                curveToRelative(-0.37f, -0.48f, -1.08f, -0.52f, -1.5f, -0.09f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.35f, 0.35f, -0.39f, 0.91f, -0.09f, 1.3f)
                curveToRelative(1.17f, 1.5f, 2.64f, 5.23f, 0.0f, 8.61f)
                curveToRelative(-0.3f, 0.39f, -0.26f, 0.95f, 0.09f, 1.3f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.43f, 0.43f, 1.13f, 0.38f, 1.5f, -0.09f)
                curveTo(22.61f, 10.95f, 24.46f, 6.16f, 21.11f, 1.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.31f, 4.84f)
                curveToRelative(-0.33f, -0.57f, -1.11f, -0.67f, -1.58f, -0.21f)
                curveToRelative(-0.33f, 0.33f, -0.36f, 0.84f, -0.13f, 1.25f)
                curveToRelative(0.25f, 0.44f, 0.74f, 1.69f, -0.01f, 2.99f)
                curveToRelative(-0.23f, 0.4f, -0.19f, 0.9f, 0.14f, 1.22f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.47f, 0.47f, 1.25f, 0.35f, 1.58f, -0.22f)
                curveTo(19.47f, 7.88f, 18.89f, 5.85f, 18.31f, 4.84f)
                close()
            }
        }
        .build()
        return _spatialAudioOff!!
    }

private var _spatialAudioOff: ImageVector? = null
