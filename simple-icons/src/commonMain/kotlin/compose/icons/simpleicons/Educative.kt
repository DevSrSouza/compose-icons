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

public val SimpleIcons.Educative: ImageVector
    get() {
        if (_educative != null) {
            return _educative!!
        }
        _educative = Builder(name = "Educative", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.998f, 4.0f)
                horizontalLineToRelative(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 20.0f)
                lineTo(24.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(5.397f, 19.576f)
                lineToRelative(-1.828f, -1.673f)
                arcToRelative(0.316f, 0.316f, 0.0f, false, true, -0.018f, -0.445f)
                lineToRelative(4.004f, -4.376f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, false, 0.009f, -0.415f)
                lineTo(3.82f, 8.217f)
                arcToRelative(0.315f, 0.315f, 0.0f, false, true, 0.038f, -0.443f)
                lineToRelative(1.893f, -1.595f)
                arcToRelative(0.315f, 0.315f, 0.0f, false, true, 0.443f, 0.038f)
                lineToRelative(5.495f, 6.537f)
                arcToRelative(0.316f, 0.316f, 0.0f, false, true, -0.008f, 0.417f)
                lineTo(5.84f, 19.559f)
                arcToRelative(0.315f, 0.315f, 0.0f, false, true, -0.442f, 0.018f)
                close()
                moveTo(20.544f, 19.474f)
                curveToRelative(0.0f, 0.174f, -0.141f, 0.315f, -0.315f, 0.315f)
                lineTo(11.74f, 19.789f)
                arcToRelative(0.315f, 0.315f, 0.0f, false, true, -0.314f, -0.315f)
                verticalLineToRelative(-2.332f)
                curveToRelative(0.0f, -0.174f, 0.14f, -0.315f, 0.314f, -0.315f)
                horizontalLineToRelative(8.488f)
                curveToRelative(0.174f, 0.0f, 0.315f, 0.14f, 0.315f, 0.315f)
                close()
            }
        }
        .build()
        return _educative!!
    }

private var _educative: ImageVector? = null
