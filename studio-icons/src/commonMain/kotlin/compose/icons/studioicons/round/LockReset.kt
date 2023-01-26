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

public val RoundGroup.LockReset: ImageVector
    get() {
        if (_lockReset != null) {
            return _lockReset!!
        }
        _lockReset = Builder(name = "LockReset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.26f, 3.0f)
                curveTo(8.17f, 2.86f, 4.0f, 6.94f, 4.0f, 12.0f)
                horizontalLineTo(2.21f)
                curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineToRelative(2.8f, -2.79f)
                curveTo(8.46f, 12.54f, 8.24f, 12.0f, 7.79f, 12.0f)
                horizontalLineTo(6.0f)
                curveToRelative(0.0f, -3.89f, 3.2f, -7.06f, 7.1f, -7.0f)
                curveToRelative(3.71f, 0.05f, 6.84f, 3.18f, 6.9f, 6.9f)
                curveToRelative(0.06f, 3.91f, -3.1f, 7.1f, -7.0f, 7.1f)
                curveToRelative(-1.59f, 0.0f, -3.05f, -0.53f, -4.23f, -1.43f)
                curveToRelative(-0.4f, -0.3f, -0.96f, -0.27f, -1.31f, 0.09f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.43f, 0.43f, -0.39f, 1.14f, 0.09f, 1.5f)
                curveTo(9.06f, 20.31f, 10.95f, 21.0f, 13.0f, 21.0f)
                curveToRelative(5.06f, 0.0f, 9.14f, -4.17f, 9.0f, -9.25f)
                curveTo(21.87f, 7.05f, 17.95f, 3.13f, 13.26f, 3.0f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveTo(16.0f, 11.45f, 15.55f, 11.0f, 15.0f, 11.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _lockReset!!
    }

private var _lockReset: ImageVector? = null
