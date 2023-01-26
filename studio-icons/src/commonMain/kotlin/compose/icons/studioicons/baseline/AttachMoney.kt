package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AttachMoney: ImageVector
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
                curveToRelative(1.78f, 0.0f, 2.44f, 0.85f, 2.5f, 2.1f)
                horizontalLineToRelative(2.21f)
                curveToRelative(-0.07f, -1.72f, -1.12f, -3.3f, -3.21f, -3.81f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.16f)
                curveToRelative(-1.94f, 0.42f, -3.5f, 1.68f, -3.5f, 3.61f)
                curveToRelative(0.0f, 2.31f, 1.91f, 3.46f, 4.7f, 4.13f)
                curveToRelative(2.5f, 0.6f, 3.0f, 1.48f, 3.0f, 2.41f)
                curveToRelative(0.0f, 0.69f, -0.49f, 1.79f, -2.7f, 1.79f)
                curveToRelative(-2.06f, 0.0f, -2.87f, -0.92f, -2.98f, -2.1f)
                horizontalLineToRelative(-2.2f)
                curveToRelative(0.12f, 2.19f, 1.76f, 3.42f, 3.68f, 3.83f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.15f)
                curveToRelative(1.95f, -0.37f, 3.5f, -1.5f, 3.5f, -3.55f)
                curveToRelative(0.0f, -2.84f, -2.43f, -3.81f, -4.7f, -4.4f)
                close()
            }
        }
        .build()
        return _attachMoney!!
    }

private var _attachMoney: ImageVector? = null
