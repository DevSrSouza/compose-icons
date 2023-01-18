package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = Builder(name = "LockOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.001f)
                curveTo(13.7084f, 2.001f, 15.2111f, 3.0821f, 15.7713f, 4.6674f)
                curveTo(15.9553f, 5.1881f, 15.6823f, 5.7594f, 15.1616f, 5.9434f)
                curveTo(14.678f, 6.1143f, 14.1509f, 5.8911f, 13.9307f, 5.4414f)
                lineTo(13.8855f, 5.3337f)
                curveTo(13.6057f, 4.5417f, 12.8541f, 4.001f, 12.0f, 4.001f)
                curveTo(10.9462f, 4.001f, 10.0828f, 4.8164f, 10.0065f, 5.8507f)
                lineTo(10.001f, 5.9999f)
                lineTo(10.001f, 7.999f)
                lineTo(17.75f, 7.9999f)
                curveTo(18.9409f, 7.9999f, 19.9156f, 8.9251f, 19.9948f, 10.0959f)
                lineTo(20.0f, 10.2499f)
                verticalLineTo(19.7462f)
                curveTo(20.0f, 20.9371f, 19.0748f, 21.9119f, 17.904f, 21.991f)
                lineTo(17.75f, 21.9962f)
                horizontalLineTo(6.25f)
                curveTo(5.0591f, 21.9962f, 4.0844f, 21.0711f, 4.0052f, 19.9003f)
                lineTo(4.0f, 19.7462f)
                verticalLineTo(10.2499f)
                curveTo(4.0f, 9.0591f, 4.9252f, 8.0843f, 6.096f, 8.0051f)
                lineTo(6.25f, 7.9999f)
                lineTo(8.001f, 7.999f)
                lineTo(8.001f, 5.9999f)
                curveTo(8.001f, 3.7914f, 9.7914f, 2.001f, 12.0f, 2.001f)
                close()
                moveTo(12.0f, 13.4995f)
                curveTo(11.1723f, 13.4995f, 10.5014f, 14.1704f, 10.5014f, 14.9981f)
                curveTo(10.5014f, 15.8257f, 11.1723f, 16.4967f, 12.0f, 16.4967f)
                curveTo(12.8277f, 16.4967f, 13.4986f, 15.8257f, 13.4986f, 14.9981f)
                curveTo(13.4986f, 14.1704f, 12.8277f, 13.4995f, 12.0f, 13.4995f)
                close()
            }
        }
        .build()
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
