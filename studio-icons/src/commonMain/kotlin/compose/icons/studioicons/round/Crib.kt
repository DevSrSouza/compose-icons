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

public val RoundGroup.Crib: ImageVector
    get() {
        if (_crib != null) {
            return _crib!!
        }
        _crib = Builder(name = "Crib", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.32f, 18.32f)
                curveToRelative(-0.36f, -0.36f, -0.92f, -0.4f, -1.31f, -0.08f)
                curveToRelative(-0.32f, 0.25f, -0.65f, 0.48f, -1.0f, 0.69f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.93f)
                curveToRelative(-0.35f, -0.2f, -0.69f, -0.43f, -1.0f, -0.69f)
                curveToRelative(-0.39f, -0.32f, -0.96f, -0.27f, -1.31f, 0.08f)
                curveToRelative(-0.42f, 0.42f, -0.39f, 1.12f, 0.08f, 1.5f)
                curveTo(7.47f, 21.18f, 9.64f, 22.0f, 12.0f, 22.0f)
                curveToRelative(2.36f, 0.0f, 4.53f, -0.82f, 6.24f, -2.18f)
                curveTo(18.71f, 19.44f, 18.74f, 18.74f, 18.32f, 18.32f)
                close()
                moveTo(14.0f, 19.75f)
                curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f)
                curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(19.75f)
                close()
            }
        }
        .build()
        return _crib!!
    }

private var _crib: ImageVector? = null
