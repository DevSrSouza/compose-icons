package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AttachMoney: ImageVector
    get() {
        if (_attachMoney != null) {
            return _attachMoney!!
        }
        _attachMoney = Builder(name = "AttachMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8f, 10.9f)
                curveToRelative(-2.27f, -0.59f, -3.0f, -1.2f, -3.0f, -2.15f)
                curveToRelative(0.0f, -1.09f, 1.01f, -1.85f, 2.7f, -1.85f)
                curveToRelative(1.42f, 0.0f, 2.13f, 0.54f, 2.39f, 1.4f)
                curveToRelative(0.12f, 0.4f, 0.45f, 0.7f, 0.87f, 0.7f)
                horizontalLineToRelative(0.3f)
                curveToRelative(0.66f, 0.0f, 1.13f, -0.65f, 0.9f, -1.27f)
                curveToRelative(-0.42f, -1.18f, -1.4f, -2.16f, -2.96f, -2.54f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(10.0f, 3.67f, 10.0f, 4.5f)
                verticalLineToRelative(0.66f)
                curveToRelative(-1.94f, 0.42f, -3.5f, 1.68f, -3.5f, 3.61f)
                curveToRelative(0.0f, 2.31f, 1.91f, 3.46f, 4.7f, 4.13f)
                curveToRelative(2.5f, 0.6f, 3.0f, 1.48f, 3.0f, 2.41f)
                curveToRelative(0.0f, 0.69f, -0.49f, 1.79f, -2.7f, 1.79f)
                curveToRelative(-1.65f, 0.0f, -2.5f, -0.59f, -2.83f, -1.43f)
                curveToRelative(-0.15f, -0.39f, -0.49f, -0.67f, -0.9f, -0.67f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-0.67f, 0.0f, -1.14f, 0.68f, -0.89f, 1.3f)
                curveToRelative(0.57f, 1.39f, 1.9f, 2.21f, 3.4f, 2.53f)
                verticalLineToRelative(0.67f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.65f)
                curveToRelative(1.95f, -0.37f, 3.5f, -1.5f, 3.5f, -3.55f)
                curveToRelative(0.0f, -2.84f, -2.43f, -3.81f, -4.7f, -4.4f)
                close()
            }
        }
        .build()
        return _attachMoney!!
    }

private var _attachMoney: ImageVector? = null
