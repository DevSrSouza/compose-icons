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

public val RoundGroup.PermDataSetting: ImageVector
    get() {
        if (_permDataSetting != null) {
            return _permDataSetting!!
        }
        _permDataSetting = Builder(name = "PermDataSetting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.99f, 11.5f)
                curveToRelative(0.34f, 0.0f, 0.68f, 0.03f, 1.01f, 0.07f)
                lineTo(20.0f, 2.42f)
                curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(1.71f, 18.29f)
                curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f)
                horizontalLineToRelative(9.15f)
                curveToRelative(-0.04f, -0.33f, -0.07f, -0.66f, -0.07f, -1.0f)
                curveToRelative(0.0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                close()
                moveTo(22.7f, 19.49f)
                curveToRelative(0.02f, -0.16f, 0.04f, -0.32f, 0.04f, -0.49f)
                reflectiveCurveToRelative(-0.01f, -0.33f, -0.04f, -0.49f)
                lineToRelative(1.06f, -0.83f)
                curveToRelative(0.09f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f)
                lineToRelative(-1.0f, -1.73f)
                curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f)
                lineToRelative(-1.24f, 0.5f)
                curveToRelative(-0.26f, -0.2f, -0.54f, -0.37f, -0.85f, -0.49f)
                lineToRelative(-0.19f, -1.32f)
                curveToRelative(-0.01f, -0.12f, -0.12f, -0.21f, -0.24f, -0.21f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.12f, 0.0f, -0.23f, 0.09f, -0.25f, 0.21f)
                lineToRelative(-0.19f, 1.32f)
                curveToRelative(-0.3f, 0.13f, -0.59f, 0.29f, -0.85f, 0.49f)
                lineToRelative(-1.24f, -0.5f)
                curveToRelative(-0.11f, -0.04f, -0.24f, 0.0f, -0.31f, 0.11f)
                lineToRelative(-1.0f, 1.73f)
                curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f)
                lineToRelative(1.06f, 0.83f)
                curveToRelative(-0.02f, 0.16f, -0.03f, 0.32f, -0.03f, 0.49f)
                reflectiveCurveToRelative(0.01f, 0.33f, 0.03f, 0.49f)
                lineToRelative(-1.06f, 0.83f)
                curveToRelative(-0.09f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f)
                lineToRelative(1.0f, 1.73f)
                curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f)
                lineToRelative(1.24f, -0.5f)
                curveToRelative(0.26f, 0.2f, 0.54f, 0.37f, 0.85f, 0.49f)
                lineToRelative(0.19f, 1.32f)
                curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.12f, 0.0f, 0.23f, -0.09f, 0.25f, -0.21f)
                lineToRelative(0.19f, -1.32f)
                curveToRelative(0.3f, -0.13f, 0.59f, -0.29f, 0.84f, -0.49f)
                lineToRelative(1.25f, 0.5f)
                curveToRelative(0.11f, 0.04f, 0.24f, 0.0f, 0.31f, -0.11f)
                lineToRelative(1.0f, -1.73f)
                curveToRelative(0.06f, -0.11f, 0.03f, -0.24f, -0.06f, -0.32f)
                lineToRelative(-1.07f, -0.83f)
                close()
                moveTo(18.99f, 20.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _permDataSetting!!
    }

private var _permDataSetting: ImageVector? = null
