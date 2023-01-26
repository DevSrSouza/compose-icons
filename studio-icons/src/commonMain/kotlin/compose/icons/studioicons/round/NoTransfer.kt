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

public val RoundGroup.NoTransfer: ImageVector
    get() {
        if (_noTransfer != null) {
            return _noTransfer!!
        }
        _noTransfer = Builder(name = "NoTransfer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.78f, 2.95f)
                curveTo(7.24f, 2.16f, 9.48f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 0.5f, 8.0f, 4.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f)
                lineTo(13.83f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.83f)
                lineTo(5.78f, 2.95f)
                close()
                moveTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-1.01f, -1.01f)
                curveTo(17.89f, 20.96f, 17.7f, 21.0f, 17.5f, 21.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.68f, -1.5f, -1.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(0.5f)
                curveTo(8.0f, 20.33f, 7.33f, 21.0f, 6.5f, 21.0f)
                reflectiveCurveTo(5.0f, 20.33f, 5.0f, 19.5f)
                verticalLineToRelative(-1.28f)
                curveTo(4.39f, 17.67f, 4.0f, 16.88f, 4.0f, 16.0f)
                verticalLineTo(6.83f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                close()
                moveTo(9.0f, 15.5f)
                curveTo(9.0f, 14.67f, 8.33f, 14.0f, 7.5f, 14.0f)
                reflectiveCurveTo(6.0f, 14.67f, 6.0f, 15.5f)
                curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f)
                reflectiveCurveTo(9.0f, 16.33f, 9.0f, 15.5f)
                close()
                moveTo(8.17f, 11.0f)
                lineTo(6.0f, 8.83f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.17f)
                close()
            }
        }
        .build()
        return _noTransfer!!
    }

private var _noTransfer: ImageVector? = null
