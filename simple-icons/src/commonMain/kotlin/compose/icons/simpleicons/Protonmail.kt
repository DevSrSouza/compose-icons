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

public val SimpleIcons.Protonmail: ImageVector
    get() {
        if (_protonmail != null) {
            return _protonmail!!
        }
        _protonmail = Builder(name = "Protonmail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.24f, 8.998f)
                lineToRelative(3.656f, -3.073f)
                verticalLineToRelative(15.81f)
                lineTo(2.482f, 21.735f)
                curveTo(1.11f, 21.735f, 0.0f, 20.609f, 0.0f, 19.223f)
                lineTo(0.0f, 6.944f)
                lineToRelative(7.58f, 6.38f)
                arcToRelative(2.186f, 2.186f, 0.0f, false, false, 2.871f, -0.042f)
                lineToRelative(4.792f, -4.284f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(9.784f, 12.536f)
                lineTo(11.593f, 10.92f)
                arcToRelative(2.438f, 2.438f, 0.0f, false, true, -1.178f, -0.533f)
                lineTo(0.905f, 2.395f)
                arcTo(0.552f, 0.552f, 0.0f, false, false, 0.0f, 2.826f)
                verticalLineToRelative(2.811f)
                lineToRelative(8.226f, 6.923f)
                arcToRelative(1.186f, 1.186f, 0.0f, false, false, 1.558f, -0.024f)
                close()
                moveTo(23.871f, 2.463f)
                arcToRelative(0.551f, 0.551f, 0.0f, false, false, -0.776f, -0.068f)
                lineToRelative(-3.199f, 2.688f)
                verticalLineToRelative(16.653f)
                horizontalLineToRelative(1.623f)
                curveToRelative(1.371f, 0.0f, 2.481f, -1.127f, 2.481f, -2.513f)
                lineTo(24.0f, 2.824f)
                arcToRelative(0.551f, 0.551f, 0.0f, false, false, -0.129f, -0.36f)
                close()
            }
        }
        .build()
        return _protonmail!!
    }

private var _protonmail: ImageVector? = null
