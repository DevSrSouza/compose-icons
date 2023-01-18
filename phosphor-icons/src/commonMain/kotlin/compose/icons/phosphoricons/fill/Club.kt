package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 148.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -80.5f, 43.5f)
                lineToRelative(10.7f, 34.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -1.2f, 7.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.4f, 3.3f)
                horizontalLineTo(101.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.4f, -3.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -1.2f, -7.1f)
                lineToRelative(10.7f, -34.1f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, true, -30.0f, 8.5f)
                curveToRelative(-27.7f, -0.8f, -50.4f, -24.0f, -50.5f, -51.8f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 76.0f, 96.0f)
                lineToRelative(4.0f, 0.2f)
                arcToRelative(53.3f, 53.3f, 0.0f, false, true, -3.9f, -23.4f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 99.8f, 23.4f)
                arcTo(51.5f, 51.5f, 0.0f, false, true, 232.0f, 148.0f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
