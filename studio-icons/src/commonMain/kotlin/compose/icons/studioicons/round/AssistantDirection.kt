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

public val RoundGroup.AssistantDirection: ImageVector
    get() {
        if (_assistantDirection != null) {
            return _assistantDirection!!
        }
        _assistantDirection = Builder(name = "AssistantDirection", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 10.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.29f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f)
                reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(19.73f, 12.58f)
                lineToRelative(-7.19f, 7.22f)
                curveToRelative(-0.35f, 0.27f, -0.79f, 0.27f, -1.15f, 0.0f)
                lineTo(4.2f, 12.58f)
                curveToRelative(-0.27f, -0.36f, -0.27f, -0.8f, 0.0f, -1.16f)
                lineToRelative(7.19f, -7.22f)
                curveToRelative(0.35f, -0.27f, 0.79f, -0.27f, 1.15f, 0.0f)
                lineToRelative(7.19f, 7.22f)
                curveTo(20.09f, 11.69f, 20.09f, 12.22f, 19.73f, 12.58f)
                close()
            }
        }
        .build()
        return _assistantDirection!!
    }

private var _assistantDirection: ImageVector? = null
