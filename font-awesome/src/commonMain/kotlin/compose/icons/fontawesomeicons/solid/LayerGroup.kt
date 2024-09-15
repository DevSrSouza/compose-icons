package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LayerGroup: ImageVector
    get() {
        if (_layerGroup != null) {
            return _layerGroup!!
        }
        _layerGroup = Builder(name = "LayerGroup", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.41f, 148.02f)
                lineToRelative(232.94f, 105.67f)
                curveToRelative(6.8f, 3.09f, 14.49f, 3.09f, 21.29f, 0.0f)
                lineToRelative(232.94f, -105.67f)
                curveToRelative(16.55f, -7.51f, 16.55f, -32.52f, 0.0f, -40.03f)
                lineTo(266.65f, 2.31f)
                arcToRelative(25.61f, 25.61f, 0.0f, false, false, -21.29f, 0.0f)
                lineTo(12.41f, 107.98f)
                curveToRelative(-16.55f, 7.51f, -16.55f, 32.53f, 0.0f, 40.04f)
                close()
                moveTo(499.59f, 236.3f)
                lineToRelative(-58.09f, -26.33f)
                lineToRelative(-161.64f, 73.27f)
                curveToRelative(-7.56f, 3.43f, -15.59f, 5.17f, -23.86f, 5.17f)
                reflectiveCurveToRelative(-16.29f, -1.74f, -23.86f, -5.17f)
                lineTo(70.51f, 209.97f)
                lineToRelative(-58.1f, 26.33f)
                curveToRelative(-16.55f, 7.5f, -16.55f, 32.5f, 0.0f, 40.0f)
                lineToRelative(232.94f, 105.59f)
                curveToRelative(6.8f, 3.08f, 14.49f, 3.08f, 21.29f, 0.0f)
                lineTo(499.59f, 276.3f)
                curveToRelative(16.55f, -7.5f, 16.55f, -32.5f, 0.0f, -40.0f)
                close()
                moveTo(499.59f, 364.1f)
                lineToRelative(-57.87f, -26.23f)
                lineToRelative(-161.86f, 73.37f)
                curveToRelative(-7.56f, 3.43f, -15.59f, 5.17f, -23.86f, 5.17f)
                reflectiveCurveToRelative(-16.29f, -1.74f, -23.86f, -5.17f)
                lineTo(70.29f, 337.87f)
                lineTo(12.41f, 364.1f)
                curveToRelative(-16.55f, 7.5f, -16.55f, 32.5f, 0.0f, 40.0f)
                lineToRelative(232.94f, 105.59f)
                curveToRelative(6.8f, 3.08f, 14.49f, 3.08f, 21.29f, 0.0f)
                lineTo(499.59f, 404.1f)
                curveToRelative(16.55f, -7.5f, 16.55f, -32.5f, 0.0f, -40.0f)
                close()
            }
        }
        .build()
        return _layerGroup!!
    }

private var _layerGroup: ImageVector? = null
