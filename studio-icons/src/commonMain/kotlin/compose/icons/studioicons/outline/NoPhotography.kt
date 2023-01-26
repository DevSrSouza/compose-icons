package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.NoPhotography: ImageVector
    get() {
        if (_noPhotography != null) {
            return _noPhotography!!
        }
        _noPhotography = Builder(name = "NoPhotography", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9f, 6.07f)
                lineTo(7.48f, 4.66f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(1.83f, 2.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f)
                lineTo(20.0f, 17.17f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-4.05f)
                lineToRelative(-1.83f, -2.0f)
                horizontalLineTo(9.88f)
                lineTo(8.9f, 6.07f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(18.17f, 21.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(9.19f, 12.02f)
                curveTo(9.08f, 12.33f, 9.0f, 12.65f, 9.0f, 13.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.35f, 0.0f, 0.67f, -0.08f, 0.98f, -0.19f)
                lineTo(9.19f, 12.02f)
                close()
                moveTo(16.17f, 19.0f)
                lineToRelative(-1.68f, -1.68f)
                curveTo(13.76f, 17.75f, 12.91f, 18.0f, 12.0f, 18.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.91f, 0.25f, -1.76f, 0.68f, -2.49f)
                lineTo(4.17f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(16.17f)
                close()
                moveTo(14.81f, 11.98f)
                lineToRelative(2.07f, 2.07f)
                curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.36f, 0.0f, -0.71f, 0.04f, -1.06f, 0.12f)
                lineToRelative(2.07f, 2.07f)
                curveTo(13.85f, 10.49f, 14.51f, 11.15f, 14.81f, 11.98f)
                close()
            }
        }
        .build()
        return _noPhotography!!
    }

private var _noPhotography: ImageVector? = null
