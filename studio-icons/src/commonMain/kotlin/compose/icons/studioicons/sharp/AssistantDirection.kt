package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AssistantDirection: ImageVector
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
                horizontalLineTo(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.5f)
                lineTo(17.0f, 11.0f)
                lineToRelative(-3.5f, -3.5f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f)
                reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(20.31f, 12.0f)
                lineToRelative(-8.34f, 8.37f)
                lineTo(3.62f, 12.0f)
                lineToRelative(8.34f, -8.37f)
                lineTo(20.31f, 12.0f)
                close()
            }
        }
        .build()
        return _assistantDirection!!
    }

private var _assistantDirection: ImageVector? = null
