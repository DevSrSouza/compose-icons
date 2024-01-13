package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hdfcbank: ImageVector
    get() {
        if (_hdfcbank != null) {
            return _hdfcbank!!
        }
        _hdfcbank = Builder(name = "Hdfcbank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.572f, 0.0f)
                verticalLineToRelative(10.842f)
                horizontalLineToRelative(3.712f)
                lineTo(4.284f, 4.485f)
                horizontalLineToRelative(6.381f)
                lineTo(10.665f, 0.0f)
                close()
                moveTo(12.985f, 0.0f)
                verticalLineToRelative(4.485f)
                horizontalLineToRelative(6.383f)
                verticalLineToRelative(6.357f)
                horizontalLineToRelative(4.06f)
                lineTo(23.428f, 0.0f)
                close()
                moveTo(8.345f, 8.53f)
                verticalLineToRelative(6.938f)
                horizontalLineToRelative(6.963f)
                lineTo(15.308f, 8.53f)
                close()
                moveTo(0.572f, 13.153f)
                lineTo(0.572f, 24.0f)
                horizontalLineToRelative(10.093f)
                verticalLineToRelative(-4.486f)
                horizontalLineToRelative(-6.38f)
                verticalLineToRelative(-6.361f)
                close()
                moveTo(19.368f, 13.153f)
                verticalLineToRelative(6.361f)
                horizontalLineToRelative(-6.383f)
                lineTo(12.985f, 24.0f)
                horizontalLineToRelative(10.443f)
                lineTo(23.428f, 13.153f)
                close()
            }
        }
        .build()
        return _hdfcbank!!
    }

private var _hdfcbank: ImageVector? = null
