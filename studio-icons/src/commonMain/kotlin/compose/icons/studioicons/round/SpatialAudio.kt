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

public val RoundGroup.SpatialAudio: ImageVector
    get() {
        if (_spatialAudio != null) {
            return _spatialAudio!!
        }
        _spatialAudio = Builder(name = "SpatialAudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 7.95f)
                curveToRelative(-1.89f, -0.23f, -5.57f, -1.83f, -6.09f, -6.09f)
                curveTo(15.96f, 1.36f, 15.54f, 1.0f, 15.04f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.6f, 0.0f, -1.07f, 0.53f, -1.0f, 1.13f)
                curveToRelative(0.31f, 2.43f, 2.38f, 7.12f, 7.8f, 7.8f)
                curveToRelative(0.6f, 0.08f, 1.13f, -0.4f, 1.13f, -1.0f)
                verticalLineToRelative(0.0f)
                curveTo(22.97f, 8.43f, 22.6f, 8.01f, 22.11f, 7.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.71f, 5.83f)
                curveToRelative(0.64f, 0.17f, 1.26f, -0.31f, 1.26f, -0.97f)
                curveToRelative(0.0f, -0.47f, -0.34f, -0.85f, -0.79f, -0.97f)
                curveToRelative(-0.49f, -0.14f, -1.72f, -0.68f, -2.11f, -2.13f)
                curveTo(19.95f, 1.32f, 19.57f, 1.0f, 19.11f, 1.0f)
                horizontalLineTo(19.1f)
                curveToRelative(-0.66f, 0.0f, -1.14f, 0.64f, -0.96f, 1.28f)
                curveTo(18.74f, 4.5f, 20.58f, 5.53f, 21.71f, 5.83f)
                close()
            }
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
                verticalLineTo(21.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.78f)
                curveTo(18.0f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                close()
            }
        }
        .build()
        return _spatialAudio!!
    }

private var _spatialAudio: ImageVector? = null
