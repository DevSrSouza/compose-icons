package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NoTransfer: ImageVector
    get() {
        if (_noTransfer != null) {
            return _noTransfer!!
        }
        _noTransfer = Builder(name = "NoTransfer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(4.0f, 6.83f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.05f, 0.0f, 0.09f, -0.02f, 0.14f, -0.03f)
                lineToRelative(1.64f, 1.64f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(7.5f, 17.0f)
                curveTo(6.67f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f)
                curveTo(6.0f, 14.67f, 6.67f, 14.0f, 7.5f, 14.0f)
                reflectiveCurveTo(9.0f, 14.67f, 9.0f, 15.5f)
                curveTo(9.0f, 16.33f, 8.33f, 17.0f, 7.5f, 17.0f)
                close()
                moveTo(6.0f, 11.0f)
                verticalLineTo(8.83f)
                lineTo(8.17f, 11.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(8.83f, 6.0f)
                lineTo(5.78f, 2.95f)
                curveTo(7.24f, 2.16f, 9.48f, 2.0f, 12.0f, 2.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 0.5f, 8.0f, 4.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f)
                lineTo(13.83f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.83f)
                close()
            }
        }
        .build()
        return _noTransfer!!
    }

private var _noTransfer: ImageVector? = null
