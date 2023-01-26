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

public val OutlineGroup.IceSkating: ImageVector
    get() {
        if (_iceSkating != null) {
            return _iceSkating!!
        }
        _iceSkating = Builder(name = "IceSkating", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.79f, -1.19f, -3.34f, -2.91f, -3.82f)
                lineToRelative(-2.62f, -0.74f)
                curveTo(12.62f, 9.19f, 12.0f, 8.39f, 12.0f, 7.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(5.0f, 16.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 6.0f, 8.0f, 6.22f, 8.0f, 6.5f)
                curveTo(8.0f, 6.78f, 8.22f, 7.0f, 8.5f, 7.0f)
                horizontalLineTo(10.0f)
                lineToRelative(0.1f, 1.0f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 8.0f, 8.0f, 8.22f, 8.0f, 8.5f)
                curveTo(8.0f, 8.78f, 8.22f, 9.0f, 8.5f, 9.0f)
                horizontalLineToRelative(1.81f)
                curveToRelative(0.45f, 1.12f, 1.4f, 2.01f, 2.6f, 2.36f)
                lineToRelative(2.62f, 0.73f)
                curveTo(16.4f, 12.33f, 17.0f, 13.1f, 17.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _iceSkating!!
    }

private var _iceSkating: ImageVector? = null
