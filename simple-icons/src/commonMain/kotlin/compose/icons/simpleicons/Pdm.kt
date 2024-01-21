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

public val SimpleIcons.Pdm: ImageVector
    get() {
        if (_pdm != null) {
            return _pdm!!
        }
        _pdm = Builder(name = "Pdm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.44f, 0.418f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, 3.12f, 0.0f)
                lineToRelative(7.69f, 4.44f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, 1.56f, 2.702f)
                verticalLineToRelative(8.88f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -1.56f, 2.702f)
                lineToRelative(-7.69f, 4.44f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -3.12f, 0.0f)
                lineToRelative(-7.69f, -4.44f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -1.56f, -2.702f)
                lineTo(1.19f, 7.56f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, 1.56f, -2.702f)
                close()
                moveTo(14.31f, 3.733f)
                lineTo(12.311f, 2.58f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, -0.624f, 0.0f)
                lineToRelative(-7.69f, 4.44f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, -0.312f, 0.54f)
                verticalLineToRelative(3.774f)
                lineToRelative(10.623f, -6.133f)
                close()
                moveTo(16.806f, 17.376f)
                lineTo(18.061f, 18.101f)
                lineTo(20.002f, 16.981f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, 0.312f, -0.541f)
                lineTo(20.314f, 7.56f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, -0.312f, -0.54f)
                lineToRelative(-3.196f, -1.845f)
                close()
                moveTo(14.309f, 15.935f)
                lineTo(14.309f, 8.083f)
                lineToRelative(-6.8f, 3.926f)
                close()
                moveTo(3.686f, 14.217f)
                verticalLineToRelative(2.223f)
                curveToRelative(0.0f, 0.223f, 0.119f, 0.429f, 0.312f, 0.54f)
                lineToRelative(7.69f, 4.44f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, 0.624f, 0.0f)
                lineToRelative(3.252f, -1.878f)
                lineToRelative(-10.55f, -6.091f)
                close()
            }
        }
        .build()
        return _pdm!!
    }

private var _pdm: ImageVector? = null
