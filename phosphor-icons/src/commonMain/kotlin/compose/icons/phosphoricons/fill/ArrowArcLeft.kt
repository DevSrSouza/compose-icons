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

public val FillGroup.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) {
            return _arrowArcLeft!!
        }
        _arrowArcLeft = Builder(name = "ArrowArcLeft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 71.7f, 116.4f)
                lineToRelative(26.1f, 26.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.7f, 8.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.4f, 4.9f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.7f, -5.6f)
                lineTo(60.3f, 105.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, 141.2f, 5.5f)
                arcTo(102.9f, 102.9f, 0.0f, false, true, 232.0f, 184.0f)
                close()
            }
        }
        .build()
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
