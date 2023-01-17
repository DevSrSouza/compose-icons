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

public val SimpleIcons.Flat: ImageVector
    get() {
        if (_flat != null) {
            return _flat!!
        }
        _flat = Builder(name = "Flat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5455f, 17.4545f)
                verticalLineToRelative(3.2728f)
                curveTo(6.5455f, 22.5348f, 5.0802f, 24.0f, 3.2727f, 24.0f)
                reflectiveCurveTo(0.0f, 22.5348f, 0.0f, 20.7273f)
                curveToRelative(0.0f, -1.8075f, 1.4652f, -3.2728f, 3.2727f, -3.2728f)
                close()
                moveTo(15.2727f, 8.7273f)
                lineTo(15.2727f, 12.0f)
                curveToRelative(0.0f, 1.8075f, -1.4652f, 3.2727f, -3.2727f, 3.2727f)
                lineTo(5.4545f, 15.2727f)
                curveToRelative(-1.8074f, 0.0f, -3.2727f, -1.4652f, -3.2727f, -3.2727f)
                curveToRelative(0.0f, -1.8075f, 1.4653f, -3.2727f, 3.2727f, -3.2727f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(3.2727f)
                curveToRelative(0.0f, 1.8075f, -1.4652f, 3.2728f, -3.2727f, 3.2728f)
                lineTo(7.6363f, 6.5455f)
                curveToRelative(-1.8074f, 0.0f, -3.2727f, -1.4653f, -3.2727f, -3.2728f)
                reflectiveCurveTo(5.829f, 0.0f, 7.6364f, 0.0f)
                close()
            }
        }
        .build()
        return _flat!!
    }

private var _flat: ImageVector? = null
