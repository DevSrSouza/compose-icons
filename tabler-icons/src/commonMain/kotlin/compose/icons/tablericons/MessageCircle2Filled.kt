package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MessageCircle2Filled: ImageVector
    get() {
        if (_messageCircle2Filled != null) {
            return _messageCircle2Filled!!
        }
        _messageCircle2Filled = Builder(name = "MessageCircle2Filled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.821f, 4.91f)
                curveToRelative(3.898f, -2.765f, 9.469f, -2.539f, 13.073f, 0.536f)
                curveToRelative(3.667f, 3.127f, 4.168f, 8.238f, 1.152f, 11.897f)
                curveToRelative(-2.842f, 3.447f, -7.965f, 4.583f, -12.231f, 2.805f)
                lineToRelative(-0.232f, -0.101f)
                lineToRelative(-4.375f, 0.931f)
                lineToRelative(-0.075f, 0.013f)
                lineToRelative(-0.11f, 0.009f)
                lineToRelative(-0.113f, -0.004f)
                lineToRelative(-0.044f, -0.005f)
                lineToRelative(-0.11f, -0.02f)
                lineToRelative(-0.105f, -0.034f)
                lineToRelative(-0.1f, -0.044f)
                lineToRelative(-0.076f, -0.042f)
                lineToRelative(-0.108f, -0.077f)
                lineToRelative(-0.081f, -0.074f)
                lineToRelative(-0.073f, -0.083f)
                lineToRelative(-0.053f, -0.075f)
                lineToRelative(-0.065f, -0.115f)
                lineToRelative(-0.042f, -0.106f)
                lineToRelative(-0.031f, -0.113f)
                lineToRelative(-0.013f, -0.075f)
                lineToRelative(-0.009f, -0.11f)
                lineToRelative(0.004f, -0.113f)
                lineToRelative(0.005f, -0.044f)
                lineToRelative(0.02f, -0.11f)
                lineToRelative(0.022f, -0.072f)
                lineToRelative(1.15f, -3.451f)
                lineToRelative(-0.022f, -0.036f)
                curveToRelative(-2.21f, -3.747f, -1.209f, -8.392f, 2.411f, -11.118f)
                lineToRelative(0.23f, -0.168f)
                close()
            }
        }
        .build()
        return _messageCircle2Filled!!
    }

private var _messageCircle2Filled: ImageVector? = null
