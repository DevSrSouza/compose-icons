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

public val BaselineGroup.NoBackpack: ImageVector
    get() {
        if (_noBackpack != null) {
            return _noBackpack!!
        }
        _noBackpack = Builder(name = "NoBackpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.76f, 2.76f)
                curveTo(4.06f, 7.31f, 4.0f, 7.64f, 4.0f, 8.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f)
                lineToRelative(0.85f, 0.85f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.83f, 12.0f)
                lineTo(6.98f, 4.15f)
                curveToRelative(0.01f, 0.0f, 0.01f, -0.01f, 0.02f, -0.01f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.14f)
                curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f)
                verticalLineToRelative(9.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.83f)
                close()
            }
        }
        .build()
        return _noBackpack!!
    }

private var _noBackpack: ImageVector? = null
