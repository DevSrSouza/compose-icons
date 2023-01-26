package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AssistantDirection: ImageVector
    get() {
        if (_assistantDirection != null) {
            return _assistantDirection!!
        }
        _assistantDirection = Builder(name = "AssistantDirection", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f)
                reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.99f, 0.0f, -9.0f, -4.01f, -9.0f, -9.0f)
                reflectiveCurveToRelative(4.01f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.01f, 9.0f, 9.0f)
                reflectiveCurveTo(16.99f, 21.0f, 12.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.73f, 11.42f)
                lineTo(12.54f, 4.2f)
                curveToRelative(-0.36f, -0.27f, -0.8f, -0.27f, -1.15f, 0.0f)
                lineTo(4.2f, 11.42f)
                curveToRelative(-0.27f, 0.36f, -0.27f, 0.8f, 0.0f, 1.16f)
                lineToRelative(7.19f, 7.22f)
                curveToRelative(0.36f, 0.27f, 0.8f, 0.27f, 1.15f, 0.0f)
                lineToRelative(7.19f, -7.22f)
                curveTo(20.09f, 12.22f, 20.09f, 11.69f, 19.73f, 11.42f)
                close()
                moveTo(13.5f, 14.5f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(13.17f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-1.09f, -1.09f)
                lineTo(13.5f, 7.5f)
                lineTo(17.0f, 11.0f)
                lineTo(13.5f, 14.5f)
                close()
            }
        }
        .build()
        return _assistantDirection!!
    }

private var _assistantDirection: ImageVector? = null
