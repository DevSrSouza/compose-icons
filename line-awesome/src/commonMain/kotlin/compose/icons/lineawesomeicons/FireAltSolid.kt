package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FireAltSolid: ImageVector
    get() {
        if (_fireAltSolid != null) {
            return _fireAltSolid!!
        }
        _fireAltSolid = Builder(name = "FireAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.799f, 4.391f)
                lineTo(13.803f, 9.387f)
                lineTo(11.953f, 7.539f)
                lineTo(11.25f, 8.338f)
                curveTo(7.767f, 12.286f, 6.0f, 15.873f, 6.0f, 19.0f)
                curveTo(6.0f, 23.962f, 10.486f, 28.0f, 16.0f, 28.0f)
                curveTo(21.514f, 28.0f, 26.0f, 23.962f, 26.0f, 19.0f)
                curveTo(26.0f, 14.238f, 20.803f, 8.366f, 17.705f, 5.289f)
                lineTo(16.799f, 4.391f)
                close()
                moveTo(17.191f, 7.623f)
                curveTo(19.767f, 10.309f, 24.0f, 15.288f, 24.0f, 19.0f)
                curveTo(24.0f, 21.391f, 22.62f, 23.504f, 20.523f, 24.768f)
                curveTo(20.822f, 24.054f, 21.0f, 23.267f, 21.0f, 22.43f)
                curveTo(21.0f, 20.049f, 19.315f, 17.224f, 17.902f, 15.275f)
                lineTo(17.059f, 14.109f)
                lineTo(14.844f, 17.432f)
                lineTo(13.438f, 16.025f)
                lineTo(12.777f, 17.115f)
                curveTo(11.598f, 19.061f, 11.0f, 20.849f, 11.0f, 22.43f)
                curveTo(11.0f, 23.267f, 11.178f, 24.054f, 11.477f, 24.768f)
                curveTo(9.38f, 23.504f, 8.0f, 21.391f, 8.0f, 19.0f)
                curveTo(8.0f, 16.611f, 9.398f, 13.677f, 12.057f, 10.471f)
                lineTo(14.197f, 12.613f)
                lineTo(17.191f, 7.623f)
                close()
                moveTo(17.104f, 17.648f)
                curveTo(18.334f, 19.565f, 19.0f, 21.234f, 19.0f, 22.43f)
                curveTo(19.0f, 24.399f, 17.654f, 26.0f, 16.0f, 26.0f)
                curveTo(14.346f, 26.0f, 13.0f, 24.399f, 13.0f, 22.43f)
                curveTo(13.0f, 21.508f, 13.29f, 20.452f, 13.865f, 19.281f)
                lineTo(15.156f, 20.57f)
                lineTo(17.104f, 17.648f)
                close()
            }
        }
        .build()
        return _fireAltSolid!!
    }

private var _fireAltSolid: ImageVector? = null
