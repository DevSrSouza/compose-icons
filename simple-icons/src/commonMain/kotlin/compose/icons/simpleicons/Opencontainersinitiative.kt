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

public val SimpleIcons.Opencontainersinitiative: ImageVector
    get() {
        if (_opencontainersinitiative != null) {
            return _opencontainersinitiative!!
        }
        _opencontainersinitiative = Builder(name = "Opencontainersinitiative", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(20.547f, 20.431f)
                lineTo(3.448f, 20.431f)
                lineTo(3.448f, 3.573f)
                horizontalLineToRelative(17.104f)
                lineTo(20.552f, 20.43f)
                close()
                moveTo(15.392f, 10.452f)
                horizontalLineToRelative(3.436f)
                verticalLineToRelative(8.255f)
                horizontalLineToRelative(-3.436f)
                close()
                moveTo(15.392f, 5.292f)
                horizontalLineToRelative(3.436f)
                verticalLineToRelative(3.436f)
                horizontalLineToRelative(-3.436f)
                close()
                moveTo(8.603f, 15.268f)
                lineTo(8.603f, 8.732f)
                horizontalLineToRelative(5.074f)
                verticalLineToRelative(-3.44f)
                lineTo(5.164f, 5.292f)
                verticalLineToRelative(13.415f)
                horizontalLineToRelative(8.513f)
                verticalLineToRelative(-3.44f)
                close()
            }
        }
        .build()
        return _opencontainersinitiative!!
    }

private var _opencontainersinitiative: ImageVector? = null
