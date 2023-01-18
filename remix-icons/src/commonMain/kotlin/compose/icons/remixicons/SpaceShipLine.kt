package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SpaceShipLine: ImageVector
    get() {
        if (_spaceShipLine != null) {
            return _spaceShipLine!!
        }
        _spaceShipLine = Builder(name = "SpaceShipLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.88f, 18.054f)
                arcToRelative(35.897f, 35.897f, 0.0f, false, true, 8.531f, -16.32f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 1.178f, 0.0f)
                curveToRelative(0.166f, 0.18f, 0.304f, 0.332f, 0.413f, 0.455f)
                arcToRelative(35.897f, 35.897f, 0.0f, false, true, 8.118f, 15.865f)
                curveToRelative(-2.141f, 0.451f, -4.34f, 0.747f, -6.584f, 0.874f)
                lineToRelative(-2.089f, 4.178f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.894f, 0.0f)
                lineToRelative(-2.089f, -4.178f)
                arcToRelative(44.019f, 44.019f, 0.0f, false, true, -6.584f, -0.874f)
                close()
                moveTo(9.578f, 16.931f)
                lineToRelative(1.157f, 0.066f)
                lineTo(12.0f, 19.527f)
                lineToRelative(1.265f, -2.53f)
                lineToRelative(1.157f, -0.066f)
                arcToRelative(42.137f, 42.137f, 0.0f, false, false, 4.227f, -0.454f)
                arcTo(33.913f, 33.913f, 0.0f, false, false, 12.0f, 4.09f)
                arcToRelative(33.913f, 33.913f, 0.0f, false, false, -6.649f, 12.387f)
                curveToRelative(1.395f, 0.222f, 2.805f, 0.374f, 4.227f, 0.454f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _spaceShipLine!!
    }

private var _spaceShipLine: ImageVector? = null
