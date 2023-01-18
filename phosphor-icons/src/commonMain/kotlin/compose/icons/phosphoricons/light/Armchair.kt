package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 90.5f)
                verticalLineTo(72.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, -38.0f)
                horizontalLineTo(80.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 42.0f, 72.0f)
                verticalLineTo(90.5f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, 75.0f)
                verticalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(165.5f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, -75.0f)
                close()
                moveTo(80.0f, 46.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 26.0f, 26.0f)
                verticalLineTo(90.5f)
                arcTo(38.1f, 38.1f, 0.0f, false, false, 170.0f, 128.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(86.0f)
                verticalLineToRelative(-2.0f)
                arcTo(38.1f, 38.1f, 0.0f, false, false, 54.0f, 90.5f)
                verticalLineTo(72.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 80.0f, 46.0f)
                close()
                moveTo(208.3f, 154.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineToRelative(-0.3f)
                arcTo(26.0f, 26.0f, 0.0f, true, true, 74.0f, 128.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(142.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.3f, 26.0f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
