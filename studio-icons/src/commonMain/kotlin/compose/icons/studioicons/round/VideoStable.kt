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

public val RoundGroup.VideoStable: ImageVector
    get() {
        if (_videoStable != null) {
            return _videoStable!!
        }
        _videoStable = Builder(name = "VideoStable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.96f, 4.01f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-12.0f)
                curveTo(21.96f, 4.91f, 21.06f, 4.01f, 19.96f, 4.01f)
                close()
                moveTo(20.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.42f, 9.01f)
                lineTo(7.92f, 6.18f)
                curveTo(7.39f, 6.04f, 6.84f, 6.35f, 6.7f, 6.88f)
                lineToRelative(-1.85f, 6.87f)
                curveToRelative(-0.14f, 0.53f, 0.17f, 1.08f, 0.71f, 1.23f)
                lineToRelative(10.5f, 2.83f)
                curveToRelative(0.53f, 0.14f, 1.08f, -0.17f, 1.23f, -0.71f)
                lineToRelative(1.85f, -6.87f)
                curveTo(19.27f, 9.7f, 18.95f, 9.15f, 18.42f, 9.01f)
                close()
            }
        }
        .build()
        return _videoStable!!
    }

private var _videoStable: ImageVector? = null
