package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 168.0f)
                horizontalLineTo(8.0f)
                lineTo(30.3f, 93.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 38.0f, 88.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.7f, 5.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.7f, 165.7f)
                horizontalLineToRelative(-0.1f)
                lineTo(233.4f, 91.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 218.0f, 80.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(19.2f, 64.0f)
                horizontalLineTo(206.0f)
                lineTo(185.4f, 91.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 170.0f, 80.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(19.2f, 64.0f)
                horizontalLineTo(158.0f)
                lineTo(137.4f, 91.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 122.0f, 80.0f)
                horizontalLineTo(38.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 22.6f, 91.4f)
                lineTo(0.4f, 165.6f)
                horizontalLineTo(0.3f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 0.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 255.7f, 165.7f)
                close()
                moveTo(38.0f, 96.0f)
                horizontalLineToRelative(84.0f)
                lineToRelative(19.2f, 64.0f)
                horizontalLineTo(18.8f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
