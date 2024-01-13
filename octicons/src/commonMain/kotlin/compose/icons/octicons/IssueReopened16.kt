package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.IssueReopened16: ImageVector
    get() {
        if (_issueReopened16 != null) {
            return _issueReopened16!!
        }
        _issueReopened16 = Builder(name = "IssueReopened16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.029f, 2.217f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 9.437f, 5.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.492f, -0.154f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.315f, -4.03f)
                lineTo(0.427f, 1.927f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 0.0f, 2.104f)
                verticalLineTo(5.75f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 0.25f, 6.0f)
                horizontalLineToRelative(3.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.177f, -0.427f)
                lineTo(2.715f, 4.215f)
                arcToRelative(6.491f, 6.491f, 0.0f, false, true, 2.314f, -1.998f)
                close()
                moveTo(1.262f, 8.169f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.22f, 0.658f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, 14.315f, 4.03f)
                lineToRelative(1.216f, 1.216f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.427f, -0.177f)
                verticalLineTo(10.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-3.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, 0.427f)
                lineToRelative(1.358f, 1.358f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, true, -11.751f, -3.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.272f, -0.506f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.06f, 9.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.12f, -2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.12f, 2.12f)
                close()
            }
        }
        .build()
        return _issueReopened16!!
    }

private var _issueReopened16: ImageVector? = null
