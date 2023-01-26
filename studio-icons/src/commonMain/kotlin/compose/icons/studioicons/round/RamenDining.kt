package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.RamenDining: ImageVector
    get() {
        if (_ramenDining != null) {
            return _ramenDining!!
        }
        _ramenDining = Builder(name = "RamenDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.84f)
                lineTo(22.0f, 2.84f)
                curveToRelative(0.0f, -0.45f, -0.39f, -0.79f, -0.83f, -0.75f)
                lineTo(4.89f, 3.9f)
                curveTo(4.38f, 3.95f, 4.0f, 4.38f, 4.0f, 4.89f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.08f)
                curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f)
                curveTo(2.52f, 16.33f, 4.83f, 19.0f, 8.0f, 20.25f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(3.17f, -1.25f, 5.48f, -3.92f, 5.92f, -7.12f)
                curveToRelative(0.08f, -0.6f, -0.4f, -1.13f, -1.0f, -1.13f)
                horizontalLineTo(10.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(10.75f)
                curveTo(21.66f, 8.0f, 22.0f, 7.66f, 22.0f, 7.25f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineTo(10.5f)
                verticalLineTo(4.78f)
                lineToRelative(10.83f, -1.19f)
                curveTo(21.71f, 3.54f, 22.0f, 3.22f, 22.0f, 2.84f)
                close()
                moveTo(6.5f, 5.22f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.34f)
                lineTo(6.5f, 5.22f)
                close()
                moveTo(5.5f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(9.0f, 6.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.06f)
                lineToRelative(1.0f, -0.11f)
                verticalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _ramenDining!!
    }

private var _ramenDining: ImageVector? = null
